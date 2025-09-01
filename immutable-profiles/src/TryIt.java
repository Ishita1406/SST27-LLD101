import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());

        UserProfile p2 = new UserProfile.Builder("u2", "x@y.com")
                .displayName("Alice Wonderland")
                .twitter("@alice")
                .build();

        System.out.println("Name: " + p2.getDisplayName());
        System.out.println("Twitter: " + p2.getTwitter());
    }
}
