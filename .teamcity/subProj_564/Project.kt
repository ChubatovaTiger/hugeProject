package subProj_564

import subProj_564.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_564")
    name = "subProj 564"

    buildType(subProj_bt_564_2)
    buildType(subProj_bt_564_1)
    buildType(subProj_bt_564_4)
    buildType(subProj_bt_564_3)
    buildType(subProj_bt_564_5)
    buildType(subProj_bt_564_0)
})
