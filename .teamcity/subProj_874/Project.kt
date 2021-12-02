package subProj_874

import subProj_874.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_874")
    name = "subProj 874"

    buildType(subProj_bt_874_2)
    buildType(subProj_bt_874_1)
    buildType(subProj_bt_874_0)
    buildType(subProj_bt_874_5)
    buildType(subProj_bt_874_4)
    buildType(subProj_bt_874_3)
})
