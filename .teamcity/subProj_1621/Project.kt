package subProj_1621

import subProj_1621.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1621")
    name = "subProj 1621"

    buildType(subProj_bt_1621_0)
    buildType(subProj_bt_1621_1)
    buildType(subProj_bt_1621_2)
    buildType(subProj_bt_1621_3)
    buildType(subProj_bt_1621_4)
    buildType(subProj_bt_1621_5)
})
