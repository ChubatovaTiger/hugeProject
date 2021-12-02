package subProj_1477

import subProj_1477.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1477")
    name = "subProj 1477"

    buildType(subProj_bt_1477_5)
    buildType(subProj_bt_1477_3)
    buildType(subProj_bt_1477_4)
    buildType(subProj_bt_1477_1)
    buildType(subProj_bt_1477_2)
    buildType(subProj_bt_1477_0)
})
