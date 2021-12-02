package subProj_961

import subProj_961.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_961")
    name = "subProj 961"

    buildType(subProj_bt_961_1)
    buildType(subProj_bt_961_0)
    buildType(subProj_bt_961_3)
    buildType(subProj_bt_961_2)
    buildType(subProj_bt_961_5)
    buildType(subProj_bt_961_4)
})
