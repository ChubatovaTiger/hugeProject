package subProj_596

import subProj_596.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_596")
    name = "subProj 596"

    buildType(subProj_bt_596_4)
    buildType(subProj_bt_596_5)
    buildType(subProj_bt_596_2)
    buildType(subProj_bt_596_3)
    buildType(subProj_bt_596_0)
    buildType(subProj_bt_596_1)
})
