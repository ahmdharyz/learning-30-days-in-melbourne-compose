package com.example.thirtydaysinmelbourne.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysinmelbourne.R

data class LandmarkTip(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int,
)

val landmarkTips = listOf(
    LandmarkTip(1, R.string.flinders_street_station_title, R.string.flinders_street_station_desc, R.drawable.flinders_street_station),
    LandmarkTip(2, R.string.federation_square_title, R.string.federation_square_desc, R.drawable.federation_square),
    LandmarkTip(3, R.string.royal_botanic_gardens_title, R.string.royal_botanic_gardens_desc, R.drawable.royal_botanic_gardens),
    LandmarkTip(4, R.string.queen_victoria_market_title, R.string.queen_victoria_market_desc, R.drawable.queen_victoria_market),
    LandmarkTip(5, R.string.melbourne_cricket_ground_title, R.string.melbourne_cricket_ground_desc, R.drawable.melbourne_cricket_ground),
    LandmarkTip(6, R.string.hosier_lane_title, R.string.hosier_lane_desc, R.drawable.hosier_lane),
    LandmarkTip(7, R.string.shrine_of_remembrance_title, R.string.shrine_of_remembrance_desc, R.drawable.shrine_of_remembrance),
    LandmarkTip(8, R.string.st_kilda_beach_title, R.string.st_kilda_beach_desc, R.drawable.st_kilda_beach),
    LandmarkTip(9, R.string.luna_park_title, R.string.luna_park_desc, R.drawable.luna_park),
    LandmarkTip(10, R.string.eureka_skydeck_title, R.string.eureka_skydeck_desc, R.drawable.eureka_skydeck),
    LandmarkTip(11, R.string.royal_exhibition_building_title, R.string.royal_exhibition_building_desc, R.drawable.royal_exhibition_building),
    LandmarkTip(12, R.string.carlton_gardens_title, R.string.carlton_gardens_desc, R.drawable.carlton_gardens),
    LandmarkTip(13, R.string.melbourne_zoo_title, R.string.melbourne_zoo_desc, R.drawable.melbourne_zoo),
    LandmarkTip(14, R.string.national_gallery_of_victoria_title, R.string.national_gallery_of_victoria_desc, R.drawable.national_gallery_of_victoria),
    LandmarkTip(15, R.string.state_library_of_victoria_title, R.string.state_library_of_victoria_desc, R.drawable.state_library_of_victoria),
    LandmarkTip(16, R.string.brighton_beach_boxes_title, R.string.brighton_beach_boxes_desc, R.drawable.brighton_beach_boxes),
    LandmarkTip(17, R.string.melbourne_museum_title, R.string.melbourne_museum_desc, R.drawable.melbourne_museum),
    LandmarkTip(18, R.string.scienceworks_title, R.string.scienceworks_desc, R.drawable.scienceworks),
    LandmarkTip(19, R.string.yarra_river_title, R.string.yarra_river_desc, R.drawable.yarra_river),
    LandmarkTip(20, R.string.docklands_title, R.string.docklands_desc, R.drawable.docklands),
    LandmarkTip(21, R.string.old_melbourne_gaol_title, R.string.old_melbourne_gaol_desc, R.drawable.old_melbourne_gaol),
    LandmarkTip(22, R.string.the_block_arcade_title, R.string.the_block_arcade_desc, R.drawable.the_block_arcade),
    LandmarkTip(23, R.string.collins_street_title, R.string.collins_street_desc, R.drawable.collins_street),
    LandmarkTip(24, R.string.melbourne_star_observation_wheel_title, R.string.melbourne_star_observation_wheel_desc, R.drawable.melbourne_star_observation_wheel),
    LandmarkTip(25, R.string.healesville_sanctuary_title, R.string.healesville_sanctuary_desc, R.drawable.healesville_sanctuary),
    LandmarkTip(26, R.string.dandenong_ranges_title, R.string.dandenong_ranges_desc, R.drawable.dandenong_ranges),
    LandmarkTip(27, R.string.great_ocean_road_title, R.string.great_ocean_road_desc, R.drawable.great_ocean_road),
    LandmarkTip(28, R.string.philip_island_title, R.string.philip_island_desc, R.drawable.philip_island),
    LandmarkTip(29, R.string.grampians_national_park_title, R.string.grampians_national_park_desc, R.drawable.grampians_national_park),
    LandmarkTip(30, R.string.puffing_billy_railway_title, R.string.puffing_billy_railway_desc, R.drawable.puffing_billy_railway)
)