package subProj_1067

import subProj_1067.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1067")
    name = "subProj 1067"

    buildType(subProj_bt_1067_3)
    buildType(subProj_bt_1067_2)
    buildType(subProj_bt_1067_5)
    buildType(subProj_bt_1067_4)
    buildType(subProj_bt_1067_1)
    buildType(subProj_bt_1067_0)
})
