package subProj_294

import subProj_294.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_294")
    name = "subProj 294"

    buildType(subProj_bt_294_0)
    buildType(subProj_bt_294_1)
    buildType(subProj_bt_294_2)
    buildType(subProj_bt_294_3)
    buildType(subProj_bt_294_4)
    buildType(subProj_bt_294_5)
})
