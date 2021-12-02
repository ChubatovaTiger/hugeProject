package subProj_179

import subProj_179.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_179")
    name = "subProj 179"

    buildType(subProj_bt_179_0)
    buildType(subProj_bt_179_2)
    buildType(subProj_bt_179_1)
    buildType(subProj_bt_179_4)
    buildType(subProj_bt_179_3)
    buildType(subProj_bt_179_5)
})
