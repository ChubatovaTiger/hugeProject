package subProj_795

import subProj_795.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_795")
    name = "subProj 795"

    buildType(subProj_bt_795_0)
    buildType(subProj_bt_795_5)
    buildType(subProj_bt_795_3)
    buildType(subProj_bt_795_4)
    buildType(subProj_bt_795_1)
    buildType(subProj_bt_795_2)
})
