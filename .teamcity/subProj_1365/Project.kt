package subProj_1365

import subProj_1365.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1365")
    name = "subProj 1365"

    buildType(subProj_bt_1365_0)
    buildType(subProj_bt_1365_5)
    buildType(subProj_bt_1365_4)
    buildType(subProj_bt_1365_3)
    buildType(subProj_bt_1365_2)
    buildType(subProj_bt_1365_1)
})
