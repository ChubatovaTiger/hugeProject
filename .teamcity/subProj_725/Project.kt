package subProj_725

import subProj_725.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_725")
    name = "subProj 725"

    buildType(subProj_bt_725_5)
    buildType(subProj_bt_725_4)
    buildType(subProj_bt_725_3)
    buildType(subProj_bt_725_2)
    buildType(subProj_bt_725_1)
    buildType(subProj_bt_725_0)
})
