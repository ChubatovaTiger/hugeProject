package subProj_1592

import subProj_1592.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1592")
    name = "subProj 1592"

    buildType(subProj_bt_1592_2)
    buildType(subProj_bt_1592_1)
    buildType(subProj_bt_1592_4)
    buildType(subProj_bt_1592_3)
    buildType(subProj_bt_1592_0)
    buildType(subProj_bt_1592_5)
})
