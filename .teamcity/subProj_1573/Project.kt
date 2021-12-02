package subProj_1573

import subProj_1573.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1573")
    name = "subProj 1573"

    buildType(subProj_bt_1573_0)
    buildType(subProj_bt_1573_1)
    buildType(subProj_bt_1573_2)
    buildType(subProj_bt_1573_3)
    buildType(subProj_bt_1573_4)
    buildType(subProj_bt_1573_5)
})
