package subProj_734

import subProj_734.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_734")
    name = "subProj 734"

    buildType(subProj_bt_734_4)
    buildType(subProj_bt_734_5)
    buildType(subProj_bt_734_0)
    buildType(subProj_bt_734_1)
    buildType(subProj_bt_734_2)
    buildType(subProj_bt_734_3)
})
