package subProj_755

import subProj_755.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_755")
    name = "subProj 755"

    buildType(subProj_bt_755_5)
    buildType(subProj_bt_755_1)
    buildType(subProj_bt_755_2)
    buildType(subProj_bt_755_3)
    buildType(subProj_bt_755_4)
    buildType(subProj_bt_755_0)
})
