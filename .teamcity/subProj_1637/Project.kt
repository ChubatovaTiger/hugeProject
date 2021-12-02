package subProj_1637

import subProj_1637.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1637")
    name = "subProj 1637"

    buildType(subProj_bt_1637_1)
    buildType(subProj_bt_1637_2)
    buildType(subProj_bt_1637_3)
    buildType(subProj_bt_1637_4)
    buildType(subProj_bt_1637_5)
    buildType(subProj_bt_1637_0)
})
