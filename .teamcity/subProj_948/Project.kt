package subProj_948

import subProj_948.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_948")
    name = "subProj 948"

    buildType(subProj_bt_948_0)
    buildType(subProj_bt_948_1)
    buildType(subProj_bt_948_2)
    buildType(subProj_bt_948_3)
    buildType(subProj_bt_948_4)
    buildType(subProj_bt_948_5)
})
