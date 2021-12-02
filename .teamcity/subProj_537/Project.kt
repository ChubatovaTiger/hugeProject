package subProj_537

import subProj_537.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_537")
    name = "subProj 537"

    buildType(subProj_bt_537_5)
    buildType(subProj_bt_537_4)
    buildType(subProj_bt_537_3)
    buildType(subProj_bt_537_2)
    buildType(subProj_bt_537_1)
    buildType(subProj_bt_537_0)
})
