package subProj_1036

import subProj_1036.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1036")
    name = "subProj 1036"

    buildType(subProj_bt_1036_4)
    buildType(subProj_bt_1036_5)
    buildType(subProj_bt_1036_0)
    buildType(subProj_bt_1036_1)
    buildType(subProj_bt_1036_2)
    buildType(subProj_bt_1036_3)
})
