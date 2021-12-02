package subProj_323

import subProj_323.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_323")
    name = "subProj 323"

    buildType(subProj_bt_323_3)
    buildType(subProj_bt_323_2)
    buildType(subProj_bt_323_1)
    buildType(subProj_bt_323_0)
    buildType(subProj_bt_323_5)
    buildType(subProj_bt_323_4)
})
