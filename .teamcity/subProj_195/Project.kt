package subProj_195

import subProj_195.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_195")
    name = "subProj 195"

    buildType(subProj_bt_195_1)
    buildType(subProj_bt_195_2)
    buildType(subProj_bt_195_0)
    buildType(subProj_bt_195_5)
    buildType(subProj_bt_195_3)
    buildType(subProj_bt_195_4)
})
