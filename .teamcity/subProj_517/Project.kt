package subProj_517

import subProj_517.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_517")
    name = "subProj 517"

    buildType(subProj_bt_517_5)
    buildType(subProj_bt_517_3)
    buildType(subProj_bt_517_4)
    buildType(subProj_bt_517_1)
    buildType(subProj_bt_517_2)
    buildType(subProj_bt_517_0)
})
