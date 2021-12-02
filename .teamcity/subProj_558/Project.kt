package subProj_558

import subProj_558.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_558")
    name = "subProj 558"

    buildType(subProj_bt_558_0)
    buildType(subProj_bt_558_1)
    buildType(subProj_bt_558_2)
    buildType(subProj_bt_558_3)
    buildType(subProj_bt_558_4)
    buildType(subProj_bt_558_5)
})
