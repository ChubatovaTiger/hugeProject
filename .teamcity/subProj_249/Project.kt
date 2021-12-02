package subProj_249

import subProj_249.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_249")
    name = "subProj 249"

    buildType(subProj_bt_249_3)
    buildType(subProj_bt_249_4)
    buildType(subProj_bt_249_1)
    buildType(subProj_bt_249_2)
    buildType(subProj_bt_249_0)
    buildType(subProj_bt_249_5)
})
