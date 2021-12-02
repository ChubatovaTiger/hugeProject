package subProj_505

import subProj_505.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_505")
    name = "subProj 505"

    buildType(subProj_bt_505_4)
    buildType(subProj_bt_505_5)
    buildType(subProj_bt_505_2)
    buildType(subProj_bt_505_3)
    buildType(subProj_bt_505_0)
    buildType(subProj_bt_505_1)
})
