package subProj_411

import subProj_411.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_411")
    name = "subProj 411"

    buildType(subProj_bt_411_0)
    buildType(subProj_bt_411_1)
    buildType(subProj_bt_411_2)
    buildType(subProj_bt_411_3)
    buildType(subProj_bt_411_4)
    buildType(subProj_bt_411_5)
})
