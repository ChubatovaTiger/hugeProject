package subProj_238

import subProj_238.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_238")
    name = "subProj 238"

    buildType(subProj_bt_238_2)
    buildType(subProj_bt_238_1)
    buildType(subProj_bt_238_4)
    buildType(subProj_bt_238_3)
    buildType(subProj_bt_238_0)
    buildType(subProj_bt_238_5)
})
