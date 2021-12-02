package subProj_538

import subProj_538.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_538")
    name = "subProj 538"

    buildType(subProj_bt_538_5)
    buildType(subProj_bt_538_4)
    buildType(subProj_bt_538_3)
    buildType(subProj_bt_538_2)
    buildType(subProj_bt_538_1)
    buildType(subProj_bt_538_0)
})
