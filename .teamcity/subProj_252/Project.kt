package subProj_252

import subProj_252.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_252")
    name = "subProj 252"

    buildType(subProj_bt_252_5)
    buildType(subProj_bt_252_3)
    buildType(subProj_bt_252_4)
    buildType(subProj_bt_252_1)
    buildType(subProj_bt_252_2)
    buildType(subProj_bt_252_0)
})
