package subProj_427

import subProj_427.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_427")
    name = "subProj 427"

    buildType(subProj_bt_427_0)
    buildType(subProj_bt_427_2)
    buildType(subProj_bt_427_1)
    buildType(subProj_bt_427_4)
    buildType(subProj_bt_427_3)
    buildType(subProj_bt_427_5)
})
