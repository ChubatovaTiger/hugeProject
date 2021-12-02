package subProj_175

import subProj_175.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_175")
    name = "subProj 175"

    buildType(subProj_bt_175_0)
    buildType(subProj_bt_175_2)
    buildType(subProj_bt_175_1)
    buildType(subProj_bt_175_4)
    buildType(subProj_bt_175_3)
    buildType(subProj_bt_175_5)
})
