package subProj_1087

import subProj_1087.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1087")
    name = "subProj 1087"

    buildType(subProj_bt_1087_4)
    buildType(subProj_bt_1087_5)
    buildType(subProj_bt_1087_2)
    buildType(subProj_bt_1087_3)
    buildType(subProj_bt_1087_0)
    buildType(subProj_bt_1087_1)
})
