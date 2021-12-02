package subProj_1475

import subProj_1475.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1475")
    name = "subProj 1475"

    buildType(subProj_bt_1475_0)
    buildType(subProj_bt_1475_5)
    buildType(subProj_bt_1475_3)
    buildType(subProj_bt_1475_4)
    buildType(subProj_bt_1475_1)
    buildType(subProj_bt_1475_2)
})
