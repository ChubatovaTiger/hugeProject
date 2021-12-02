package subProj_1948

import subProj_1948.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1948")
    name = "subProj 1948"

    buildType(subProj_bt_1948_1)
    buildType(subProj_bt_1948_0)
    buildType(subProj_bt_1948_5)
    buildType(subProj_bt_1948_4)
    buildType(subProj_bt_1948_3)
    buildType(subProj_bt_1948_2)
})
