package com.cracky_axe.pxohlqo.udabake

class MiriamsMenu {

    val sourceJsonUrl: String = "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/baking-cn.json"

    class IngredientItem(val quantity: Double, val measure: String, val ingredientName: String)

    class BakeStep(val id: Int, val shortDescription: String, val description: String, val videoUrl: String)

    class RecipeItem(val id: Int, val recipeName: String, val ingredients: List<IngredientItem>, val steps: List<BakeStep>, val servings: Int)

    val recipres = listOf<RecipeItem>(
            RecipeItem(
                    1,
                    "Nutella Pie",
                    ingredients = listOf<IngredientItem>(
                            IngredientItem(
                                    quantity = 2.0,
                                    measure = "CUP",
                                    ingredientName = "Graham Cracker crumbs"),
                            IngredientItem(
                                    quantity = 6.0,
                                    measure = "TBLSP",
                                    ingredientName = "unsalted butter, melted"),
                            IngredientItem(
                                    0.5,
                                    "CUP",
                                    "granulated sugar"),
                            IngredientItem(
                                    1.5,
                                    "TSP",
                                    "salt"),
                            IngredientItem(
                                    5.0,
                                    "TBLSP",
                                    "vanilla"),
                            IngredientItem(
                                    1.0,
                                    "K",
                                    "Nutella or other chocolate-hazelnut spread"),
                            IngredientItem(
                                    500.0,
                                    "G",
                                    "Mascapone Cheese(room temperature)"),
                            IngredientItem(
                                    1.0,
                                    "CUP",
                                    "heavy cream(cold)"
                            ),
                            IngredientItem(
                                    4.0,
                                    "OZ",
                                    "cream cheese(softened)")
                    ),
                    steps = listOf<BakeStep>(
                            BakeStep(
                                    0,
                                    "Recipe Introduction",
                                    "Recipe Introduction",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/-intro-creampie.mp4"
                            ),
                            BakeStep(
                                    1,
                                    "Starting prep",
                                    "1. Preheat the oven to 350°F. Butter a 9\" deep dish pie pan.",
                                    ""
                            ),
                            BakeStep(
                                    2,
                                    "Prep the cookie crust.",
                                    "2. Whisk the graham cracker crumbs, 50 grams (1/4 cup) of sugar, and 1/2 teaspoon of salt together in a medium bowl. Pour the melted butter and 1 teaspoon of vanilla into the dry ingredients and stir together until evenly mixed.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/2-mix-sugar-crackers-creampie.mp4"
                            ),
                            BakeStep(
                                    3,
                                    "Press the crust into baking form.",
                                    "3. Press the cookie crumb mixture into the prepared pie pan and bake for 12 minutes. Let crust cool to room temperature.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/4-press-crumbs-in-pie-plate-creampie.mp4"
                            ),
                            BakeStep(
                                    4,
                                    "Start filling prep",
                                    "4. Beat together the nutella, mascarpone, 1 teaspoon of salt, and 1 tablespoon of vanilla on medium speed in a stand mixer or high speed with a hand mixer until fluffy.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/1-mix-marscapone-nutella-creampie.mp4"
                            ),
                            BakeStep(
                                    5,
                                    "Finish filling prep",
                                    "5. Beat the cream cheese and 50 grams (1/4 cup) of sugar on medium speed in a stand mixer or high speed with a hand mixer for 3 minutes. Decrease the speed to medium-low and gradually add in the cold cream. Add in 2 teaspoons of vanilla and beat until stiff peaks form.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/7-add-cream-mix-creampie.mp4"
                            ),
                            BakeStep(
                                    6,
                                    "Finishing Steps",
                                    "6. Pour the filling into the prepared crust and smooth the top. Spread the whipped cream over the filling. Refrigerate the pie for at least 2 hours. Then it's ready to serve!",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/9-add-mixed-nutella-to-crust-creampie.mp4"
                            )
                    ),
                    servings = 8),

            RecipeItem(
                    2,
                    "Brownies",
                    listOf<IngredientItem>(
                            IngredientItem(
                                    350.0,
                                    "G",
                                    "Bittersweet chocolate (60-70% cacao)"
                            ),
                            IngredientItem(
                                    226.0,
                                    "G",
                                    "unsalted butter"
                            ),
                            IngredientItem(
                                    300.0,
                                    "G",
                                    "granulated sugar"
                            ),
                            IngredientItem(
                                    100.0,
                                    "G",
                                    "light brown sugar"
                            ),
                            IngredientItem(
                                    5.0,
                                    "UNIT",
                                    "large eggs"
                            ),
                            IngredientItem(
                                    1.0,
                                    "TBLSP",
                                    "vanilla extract"
                            ),
                            IngredientItem(
                                    140.0,
                                    "G",
                                    "all purpose flour"
                            ),
                            IngredientItem(
                                    40.0,
                                    "G",
                                    "cocoa powder"
                            ),
                            IngredientItem(
                                    1.5,
                                    "TSP",
                                    "salt"
                            ),
                            IngredientItem(
                                    350.0,
                                    "G",
                                    "semisweet chocolate chips"
                            )
                    ),
                    listOf<BakeStep>(
                            BakeStep(
                                    0,
                                    "Recipe Introduction",
                                    "Recipe Introduction",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/-intro-brownies.mp4"
                            ),
                            BakeStep(
                                    1,
                                    "Starting prep",
                                    "1. Preheat the oven to 350\\ufffdF. Butter the bottom and sides of a 9\\\"x13\\\" pan.",
                                    ""
                            ),
                            BakeStep(
                                    2,
                                    "Melt butter and bittersweet chocolate.",
                                    "2. Melt the butter and bittersweet chocolate together in a microwave or a double boiler. If microwaving, heat for 30 seconds at a time, removing bowl and stirring ingredients in between.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/1-melt-choclate-chips-and-butter-brownies.mp4"
                            ),
                            BakeStep(
                                    3,
                                    "Add sugars to wet mixture.",
                                    "3. Mix both sugars into the melted chocolate in a large mixing bowl until mixture is smooth and uniform.",
                                    ""
                            ),
                            BakeStep(
                                    4,
                                    "Mix together dry ingredients.",
                                    "4. Sift together the flour, cocoa, and salt in a small bowl and whisk until mixture is uniform and no clumps remain. ",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/4-sift-flower-add-coco-powder-salt-brownies.mp4"
                            ),
                            BakeStep(
                                    5,
                                    "Add eggs.",
                                    "5. Crack 3 eggs into the chocolate mixture and carefully fold them in. Crack the other 2 eggs in and carefully fold them in. Fold in the vanilla.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/2-mix-egss-with-choclate-butter-brownies.mp4"
                            ),
                            BakeStep(
                                    6,
                                    "Add dry mixture to wet mixture.",
                                    "6. Dump half of flour mixture into chocolate mixture and carefully fold in, just until no streaks remain. Repeat with the rest of the flour mixture. Fold in the chocolate chips.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/5-mix-wet-and-cry-batter-together-brownies.mp4"
                            ),
                            BakeStep(
                                    7,
                                    "Add batter to pan.",
                                    "7. Pour the batter into the prepared pan and bake for 30 minutes.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/8-put-brownies-in-oven-to-bake-brownies.mp4"
                            ),
                            BakeStep(
                                    8,
                                    "Remove pan from oven.",
                                    "8. Remove the pan from the oven and let cool until room temperature. If you want to speed this up, you can feel free to put the pan in a freezer for a bit.",
                                    ""
                            ),
                            BakeStep(
                                    9,
                                    "Cut and serve.",
                                    "9. Cut and serve.",
                                    "https://s3.cn-north-1.amazonaws.com.cn/static-documents/nd801/ProjectResources/Baking/9-final-product-brownies.mp4"
                            )
                    ),
                    8
            )

    )


}