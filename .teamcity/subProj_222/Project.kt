package subProj_222

import subProj_222.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_222")
    name = "subProj 222"

    buildType(subProj_bt_222_3)
    buildType(subProj_bt_222_2)
    buildType(subProj_bt_222_5)
    buildType(subProj_bt_222_4)
    buildType(subProj_bt_222_1)
    buildType(subProj_bt_222_0)
})
