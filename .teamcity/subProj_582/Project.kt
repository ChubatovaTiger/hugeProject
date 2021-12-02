package subProj_582

import subProj_582.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_582")
    name = "subProj 582"

    buildType(subProj_bt_582_5)
    buildType(subProj_bt_582_0)
    buildType(subProj_bt_582_3)
    buildType(subProj_bt_582_4)
    buildType(subProj_bt_582_1)
    buildType(subProj_bt_582_2)
})
