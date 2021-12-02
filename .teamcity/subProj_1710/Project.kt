package subProj_1710

import subProj_1710.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1710")
    name = "subProj 1710"

    buildType(subProj_bt_1710_2)
    buildType(subProj_bt_1710_1)
    buildType(subProj_bt_1710_4)
    buildType(subProj_bt_1710_3)
    buildType(subProj_bt_1710_0)
    buildType(subProj_bt_1710_5)
})
