package subProj_681

import subProj_681.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_681")
    name = "subProj 681"

    buildType(subProj_bt_681_5)
    buildType(subProj_bt_681_0)
    buildType(subProj_bt_681_1)
    buildType(subProj_bt_681_2)
    buildType(subProj_bt_681_3)
    buildType(subProj_bt_681_4)
})
