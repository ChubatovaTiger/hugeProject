package subProj_468

import subProj_468.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_468")
    name = "subProj 468"

    buildType(subProj_bt_468_1)
    buildType(subProj_bt_468_0)
    buildType(subProj_bt_468_5)
    buildType(subProj_bt_468_4)
    buildType(subProj_bt_468_3)
    buildType(subProj_bt_468_2)
})
