package subProj_461

import subProj_461.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_461")
    name = "subProj 461"

    buildType(subProj_bt_461_5)
    buildType(subProj_bt_461_0)
    buildType(subProj_bt_461_4)
    buildType(subProj_bt_461_3)
    buildType(subProj_bt_461_2)
    buildType(subProj_bt_461_1)
})
