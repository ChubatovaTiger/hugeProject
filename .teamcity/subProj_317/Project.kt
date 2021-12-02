package subProj_317

import subProj_317.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_317")
    name = "subProj 317"

    buildType(subProj_bt_317_1)
    buildType(subProj_bt_317_2)
    buildType(subProj_bt_317_0)
    buildType(subProj_bt_317_5)
    buildType(subProj_bt_317_3)
    buildType(subProj_bt_317_4)
})
