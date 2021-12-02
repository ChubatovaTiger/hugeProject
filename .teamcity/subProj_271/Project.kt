package subProj_271

import subProj_271.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_271")
    name = "subProj 271"

    buildType(subProj_bt_271_5)
    buildType(subProj_bt_271_4)
    buildType(subProj_bt_271_3)
    buildType(subProj_bt_271_2)
    buildType(subProj_bt_271_1)
    buildType(subProj_bt_271_0)
})
