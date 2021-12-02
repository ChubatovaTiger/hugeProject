package subProj_1185

import subProj_1185.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1185")
    name = "subProj 1185"

    buildType(subProj_bt_1185_5)
    buildType(subProj_bt_1185_1)
    buildType(subProj_bt_1185_2)
    buildType(subProj_bt_1185_3)
    buildType(subProj_bt_1185_4)
    buildType(subProj_bt_1185_0)
})
