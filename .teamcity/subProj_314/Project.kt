package subProj_314

import subProj_314.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_314")
    name = "subProj 314"

    buildType(subProj_bt_314_0)
    buildType(subProj_bt_314_1)
    buildType(subProj_bt_314_4)
    buildType(subProj_bt_314_5)
    buildType(subProj_bt_314_2)
    buildType(subProj_bt_314_3)
})
