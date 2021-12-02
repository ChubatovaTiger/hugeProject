package subProj_144

import subProj_144.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_144")
    name = "subProj 144"

    buildType(subProj_bt_144_5)
    buildType(subProj_bt_144_4)
    buildType(subProj_bt_144_3)
    buildType(subProj_bt_144_2)
    buildType(subProj_bt_144_1)
    buildType(subProj_bt_144_0)
})
