package subProj_710

import subProj_710.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_710")
    name = "subProj 710"

    buildType(subProj_bt_710_1)
    buildType(subProj_bt_710_0)
    buildType(subProj_bt_710_5)
    buildType(subProj_bt_710_4)
    buildType(subProj_bt_710_3)
    buildType(subProj_bt_710_2)
})
