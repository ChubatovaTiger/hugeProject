package subProj_1795

import subProj_1795.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1795")
    name = "subProj 1795"

    buildType(subProj_bt_1795_1)
    buildType(subProj_bt_1795_0)
    buildType(subProj_bt_1795_3)
    buildType(subProj_bt_1795_2)
    buildType(subProj_bt_1795_5)
    buildType(subProj_bt_1795_4)
})
