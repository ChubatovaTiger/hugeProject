package subProj_574

import subProj_574.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_574")
    name = "subProj 574"

    buildType(subProj_bt_574_3)
    buildType(subProj_bt_574_2)
    buildType(subProj_bt_574_5)
    buildType(subProj_bt_574_4)
    buildType(subProj_bt_574_1)
    buildType(subProj_bt_574_0)
})
