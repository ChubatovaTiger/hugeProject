package subProj_967

import subProj_967.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_967")
    name = "subProj 967"

    buildType(subProj_bt_967_3)
    buildType(subProj_bt_967_2)
    buildType(subProj_bt_967_5)
    buildType(subProj_bt_967_4)
    buildType(subProj_bt_967_1)
    buildType(subProj_bt_967_0)
})
