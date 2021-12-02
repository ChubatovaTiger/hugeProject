package subProj_1558

import subProj_1558.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1558")
    name = "subProj 1558"

    buildType(subProj_bt_1558_5)
    buildType(subProj_bt_1558_4)
    buildType(subProj_bt_1558_3)
    buildType(subProj_bt_1558_2)
    buildType(subProj_bt_1558_1)
    buildType(subProj_bt_1558_0)
})
