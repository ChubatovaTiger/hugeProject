package subProj_293

import subProj_293.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_293")
    name = "subProj 293"

    buildType(subProj_bt_293_0)
    buildType(subProj_bt_293_1)
    buildType(subProj_bt_293_2)
    buildType(subProj_bt_293_3)
    buildType(subProj_bt_293_4)
    buildType(subProj_bt_293_5)
})
